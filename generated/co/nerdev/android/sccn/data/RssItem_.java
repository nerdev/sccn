//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package co.nerdev.android.sccn.data;

import android.content.Context;

public final class RssItem_
    extends RssItem
{

    private Context context_;

    private RssItem_(Context context) {
        context_ = context;
        init_();
    }

    public static RssItem_ getInstance_(Context context) {
        return new RssItem_(context);
    }

    private void init_() {
    }

    public void rebind(Context context) {
        context_ = context;
        init_();
    }

}
