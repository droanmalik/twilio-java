package com.twilio.example.resource;

import com.twilio.sdk.Twilio;
import com.twilio.sdk.exception.ApiException;
import com.twilio.sdk.fetcher.api.v2010.account.CallFetcher;
import com.twilio.sdk.resource.api.v2010.account.Call;

/**
 * Fetch a call.
 */
public class CallFetcherExample {

    @SuppressWarnings("checkstyle:javadocmethod")
    public static void main(String[] args) {
        Twilio.init("AC123", "AUTH TOKEN");

        try {

            CallFetcher fetcher = new CallFetcher("AC123", "CA123");
            Call call = fetcher.execute();

            System.out.print(call.getSid());

        } catch (ApiException e) {

            System.err.println("womp womp");
            System.exit(1);

        }
    }

}