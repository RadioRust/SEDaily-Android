package com.koalatea.thehollidayinn.softwareengineeringdaily.app;

import android.content.Context;

import com.koalatea.thehollidayinn.softwareengineeringdaily.analytics.AnalyticsFacade;
import com.koalatea.thehollidayinn.softwareengineeringdaily.analytics.AnalyticsModule;
import com.koalatea.thehollidayinn.softwareengineeringdaily.dagger.NetworkModule;
import com.koalatea.thehollidayinn.softwareengineeringdaily.data.remote.APIInterface;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Kurian on 25-Sep-17.
 */
@Singleton
@Component(modules = {
        AppModule.class,
        AnalyticsModule.class,
        NetworkModule.class})
public interface AppComponent {
    Context context();
    AnalyticsFacade analyticsFacade();
    APIInterface kibblService();
}
