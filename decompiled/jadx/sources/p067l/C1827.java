package p067l;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.᩶֫ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C1827 extends MediaSession.Callback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC1057 f66756;

    public C1827(AbstractC1057 abstractC1057) {
        this.f66756 = abstractC1057;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        C2015.m54538(bundle);
        m47967(c1442M47966);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                C1560 c1560 = c1442M47966.f39163;
                InterfaceC0952 interfaceC0952M36710 = c1560.m36710();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", interfaceC0952M36710 == null ? null : interfaceC0952M36710.asBinder());
                InterfaceC8422 interfaceC8422M36713 = c1560.m36713();
                if (interfaceC8422M36713 != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(C0655am.f2320av, new C5740(interfaceC8422M36713));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
        }
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return false;
        }
        m47967(c1442M47966);
        boolean zMo10557 = this.f66756.mo10557(intent);
        c1442M47966.mo10976((C22636) null);
        return zMo10557 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        this.f66756.mo10558();
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        C2015.m54538(bundle);
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        C2015.m54538(bundle);
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        C2015.m54538(bundle);
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        this.f66756.mo10555();
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        this.f66756.mo10559();
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        this.f66756.mo10560();
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        this.f66756.mo10556(j);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        C1687.m42233(rating);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        C2015.m54538(bundle);
        m47967(c1442M47966);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                C2015.m54538(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    C2015.m54538(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    C2015.m54538(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    C2015.m54538(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    C2015.m54538(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                }
            }
        } catch (BadParcelableException unused) {
        }
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        C2015.m54538(bundle);
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        C2015.m54538(bundle);
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        C2015.m54538(bundle);
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        C1442 c1442M47966 = m47966();
        if (c1442M47966 == null) {
            return;
        }
        m47967(c1442M47966);
        c1442M47966.mo10976((C22636) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47967(C1442 c1442) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = c1442.f39157;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c1442.mo10976(new C22636(str, -1, -1));
    }

    /* JADX INFO: renamed from: ֫ */
    private C1442 m47966() {
        C1442 c1442;
        synchronized (this.f66756.f16736) {
            c1442 = (C1442) this.f66756.f16737.get();
        }
        if (c1442 == null || this.f66756 != c1442.mo10975()) {
            return null;
        }
        return c1442;
    }
}
