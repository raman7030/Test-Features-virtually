package p067l;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5LS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC16429 extends DialogInterfaceOnCancelListenerC12199 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public CharSequence f48287;

    /* JADX INFO: renamed from: ۙ */
    public CharSequence f48288;

    /* JADX INFO: renamed from: ۤ */
    public int f48289;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC12898 f48290;

    /* JADX INFO: renamed from: ۬ */
    public CharSequence f48291;

    /* JADX INFO: renamed from: ᩶ */
    public CharSequence f48292;

    /* JADX INFO: renamed from: ᩸ */
    public BitmapDrawable f48293;

    /* JADX INFO: renamed from: ᩹ */
    public int f48294;

    /* JADX INFO: renamed from: ֫ */
    public void mo23821(C1779 c1779) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo23822(boolean z);

    /* JADX INFO: renamed from: ܽ */
    public void mo25079() {
    }

    @Override // p067l.DialogInterfaceOnCancelListenerC12199, p067l.ComponentCallbacksC11117
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC6699 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof InterfaceC4180)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC4180 interfaceC4180 = (InterfaceC4180) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle == null) {
            AbstractC12898 abstractC12898 = (AbstractC12898) interfaceC4180.findPreference(string);
            this.f48290 = abstractC12898;
            this.f48288 = abstractC12898.m29553();
            this.f48291 = this.f48290.m29549();
            this.f48287 = this.f48290.m29548();
            this.f48292 = this.f48290.m29551();
            this.f48294 = this.f48290.m29552();
            Drawable drawableM29550 = this.f48290.m29550();
            if (drawableM29550 == null || (drawableM29550 instanceof BitmapDrawable)) {
                this.f48293 = (BitmapDrawable) drawableM29550;
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM29550.getIntrinsicWidth(), drawableM29550.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM29550.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableM29550.draw(canvas);
            this.f48293 = new BitmapDrawable(getResources(), bitmapCreateBitmap);
            return;
        }
        this.f48288 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f48291 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f48287 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f48292 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f48294 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f48293 = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // p067l.DialogInterfaceOnCancelListenerC12199, p067l.ComponentCallbacksC11117
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f48288);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f48291);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f48287);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f48292);
        bundle.putInt("PreferenceDialogFragment.layout", this.f48294);
        BitmapDrawable bitmapDrawable = this.f48293;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // p067l.DialogInterfaceOnCancelListenerC12199
    public final Dialog onCreateDialog(Bundle bundle) {
        this.f48289 = -2;
        C1779 negativeButton = new C1779(requireContext()).setTitle(this.f48288).setIcon(this.f48293).setPositiveButton(this.f48291, this).setNegativeButton(this.f48287, this);
        requireContext();
        int i = this.f48294;
        View viewInflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            mo25078(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f48292);
        }
        mo23821(negativeButton);
        DialogInterfaceC1814 dialogInterfaceC1814Create = negativeButton.create();
        if (this instanceof C10886) {
            Window window = dialogInterfaceC1814Create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C19112.m43424(window);
                return dialogInterfaceC1814Create;
            }
            mo25079();
        }
        return dialogInterfaceC1814Create;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12898 m37326() {
        if (this.f48290 == null) {
            this.f48290 = (AbstractC12898) ((InterfaceC4180) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.f48290;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo25078(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f48292;
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
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f48289 = i;
    }

    @Override // p067l.DialogInterfaceOnCancelListenerC12199, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo23822(this.f48289 == -1);
    }
}
