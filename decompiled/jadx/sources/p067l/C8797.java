package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8797 {
    /* JADX INFO: renamed from: ֫ */
    public static void m20361(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList, RunnableC19910 runnableC19910) {
        final ArrayList arrayList2 = new ArrayList(arrayList);
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) viewM12252.findViewById(R.id.MT_Protector);
        final C14849 c14849 = (C14849) viewM12252.findViewById(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.MT_Protector);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.֫۫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC21283 adapter = c14849.getAdapter();
                boolean z = view.getTag(R.id.MT_Protector) != null;
                C1898 c1898 = new C1898(view.getContext(), view, 0);
                C0994 c0994M50638 = c1898.m50638();
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setCheckable(true).setChecked(z);
                c1898.m50636(new C18855(arrayList2, z, view, adapter));
                c1898.m50639();
            }
        });
        C7040.m16183(c14849);
        C3847 c3847 = new C3847(new C18184(arrayList2));
        c14849.setAdapter(new C16172(abstractActivityC5549, arrayList2, c3847));
        c3847.m7551(c14849);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12821(arrayList, arrayList2, runnableC19910, 0));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
