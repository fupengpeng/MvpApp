package com.fpp.guestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fpp.guestapp.utils.LogUtil;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initOne();


    }

    private void initOne() {

        //创建一个上游 Observable：
        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        });
        //创建一个下游 Observer
        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                LogUtil.d(TAG, "onSubscribe");
            }

            @Override
            public void onNext(Integer value) {
                LogUtil.d(TAG, "onNext  " + value);
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.d(TAG, "onError");
            }

            @Override
            public void onComplete() {
                LogUtil.d(TAG, "onComplete");
            }
        };
        //建立连接
        observable.subscribe(observer);


    }
}
