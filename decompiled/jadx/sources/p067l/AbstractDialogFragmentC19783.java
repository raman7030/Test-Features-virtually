package p067l;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩳ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G547 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class AbstractDialogFragmentC19783 extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public CharSequence f60183;

    /* JADX INFO: renamed from: ۙ */
    public CharSequence f60184;

    /* JADX INFO: renamed from: ۤ */
    public int f60185;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC12898 f60186;

    /* JADX INFO: renamed from: ۬ */
    public CharSequence f60187;

    /* JADX INFO: renamed from: ᩶ */
    public CharSequence f60188;

    /* JADX INFO: renamed from: ᩸ */
    public BitmapDrawable f60189;

    /* JADX INFO: renamed from: ᩹ */
    public int f60190;

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public void mo15723(AlertDialog.Builder builder) {
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15724(boolean z);

    @Deprecated
    public AbstractDialogFragmentC19783() {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof InterfaceC4180)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC4180 interfaceC4180 = (InterfaceC4180) targetFragment;
        String string = getArguments().getString("key");
        if (bundle == null) {
            AbstractC12898 abstractC12898 = (AbstractC12898) interfaceC4180.findPreference(string);
            this.f60186 = abstractC12898;
            this.f60184 = abstractC12898.m29553();
            this.f60187 = this.f60186.m29549();
            this.f60183 = this.f60186.m29548();
            this.f60188 = this.f60186.m29551();
            this.f60190 = this.f60186.m29552();
            Drawable drawableM29550 = this.f60186.m29550();
            if (drawableM29550 == null || (drawableM29550 instanceof BitmapDrawable)) {
                this.f60189 = (BitmapDrawable) drawableM29550;
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM29550.getIntrinsicWidth(), drawableM29550.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM29550.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableM29550.draw(canvas);
            this.f60189 = new BitmapDrawable(getResources(), bitmapCreateBitmap);
            return;
        }
        this.f60184 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f60187 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f60183 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f60188 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f60190 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f60189 = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f60184);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f60187);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f60183);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f60188);
        bundle.putInt("PreferenceDialogFragment.layout", this.f60190);
        BitmapDrawable bitmapDrawable = this.f60189;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.f60185 = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f60184).setIcon(this.f60189).setPositiveButton(this.f60187, this).setNegativeButton(this.f60183, this);
        int i = this.f60190;
        View viewInflate = i != 0 ? LayoutInflater.from(activity).inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            mo44965(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f60188);
        }
        mo15723(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (this instanceof DialogFragmentC22286) {
            Window window = alertDialogCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C18441.m42006(window);
                return alertDialogCreate;
            }
            window.setSoftInputMode(5);
        }
        return alertDialogCreate;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12898 m44964() {
        if (this.f60186 == null) {
            this.f60186 = (AbstractC12898) ((InterfaceC4180) getTargetFragment()).findPreference(getArguments().getString("key"));
        }
        return this.f60186;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public void mo44965(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f60188;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f60185 = i;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo15724(this.f60185 == -1);
    }
}
