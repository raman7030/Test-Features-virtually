package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6764 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18413(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList, RunnableC18457 runnableC18457) {
        final ArrayList arrayList2 = new ArrayList(arrayList);
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) viewM10216.findViewById(R.id.MT_Protector);
        final C13132 c13132 = (C13132) viewM10216.findViewById(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.MT_Protector);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.֫۫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC19902 adapter = c13132.getAdapter();
                boolean z = view.getTag(R.id.MT_Protector) != null;
                C21282 c21282 = new C21282(view.getContext(), view, 0);
                C3060 c3060M48304 = c21282.m48304();
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setCheckable(true).setChecked(z);
                c21282.m48302(new C17347(arrayList2, z, view, adapter));
                c21282.m48305();
            }
        });
        C4915.m14286(c13132);
        C1556 c1556 = new C1556(new C16641(arrayList2));
        c13132.setAdapter(new C14524(abstractActivityC3346, arrayList2, c1556));
        c1556.m5322(c13132);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10998(arrayList, arrayList2, runnableC18457, 0));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
