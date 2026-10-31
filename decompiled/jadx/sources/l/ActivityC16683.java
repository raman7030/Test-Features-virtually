package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܽܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16683 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51209 = 0;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public List f51210 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C11040 f51211;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "SchemeManagerActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.string.MT_Protector);
        m10241(R.layout.MT_Protector);
        this.f10584 = (C9762) m10241(R.id.MT_Protector);
        ListView listView = (ListView) m10241(android.R.id.list);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC3420(this, 1));
        this.f51210 = C16249.m38218();
        C11040 c11040 = new C11040(this);
        this.f51211 = c11040;
        listView.setAdapter((ListAdapter) c11040);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f51210 = C16249.m38218();
        this.f51211.notifyDataSetChanged();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            C14132 c14132 = new C14132(this, this);
            c14132.m31258(R.string.MT_Protector);
            c14132.m31244();
            c14132.m31279(6);
            c14132.m31266(true);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        try {
            C12951 c12951M31485 = C12951.m31485(Base64.decode(C4925.m14330().trim(), 3));
            C22124.m49722((InterfaceC20008) c12951M31485, -2106428910);
            String strM31506 = c12951M31485.m31506();
            String strM31507 = c12951M31485.m31506();
            if (strM31507.hashCode() != c12951M31485.readInt()) {
                throw new Exception();
            }
            C9195 c9195 = new C9195(C16249.m38222(strM31506));
            c9195.m23630(new JSONObject(strM31507));
            C16249.m38217(c9195);
            this.f51210 = C16249.m38218();
            this.f51211.notifyDataSetChanged();
            C21374.m48457(R.string.MT_Protector);
            return true;
        } catch (Exception unused) {
            C21374.m48457(R.string.MT_Protector);
            return true;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.f51210.get(i);
        Intent intent = new Intent(this, (Class<?>) ActivityC6372.class);
        intent.putExtra("schemeName", str);
        startActivity(intent);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C21282 c21282 = new C21282(this, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.ۨ᩺ܽ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC16683.m39213(this.f35969, i, menuItem);
                return true;
            }
        });
        C18342.m42767(view, c21282);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39213(final ActivityC16683 activityC16683, int i, MenuItem menuItem) {
        final String str = (String) activityC16683.f51210.get(i);
        int i2 = 3;
        if (menuItem.getItemId() == R.string.MT_Protector) {
            try {
                String string = C16249.m38221(str).m23632().toString();
                C10130 c10130 = new C10130();
                c10130.writeInt(-2106428910);
                c10130.m25439(str);
                c10130.m25439(string);
                c10130.writeInt(string.hashCode());
                C4925.m14314((CharSequence) Base64.encodeToString(c10130.m25429(), 3));
                return;
            } catch (Exception e) {
                activityC16683.m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            C7783 c7783 = new C7783(activityC16683, activityC16683, str);
            c7783.m31258(R.string.MT_Protector);
            c7783.m31250((CharSequence) str);
            c7783.m31244();
            c7783.m31279(6);
            c7783.m31281();
            c7783.m31266(true);
            return;
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            int i3 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC16683);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44424(activityC16683.getString(R.string.MT_Protector, str));
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺᩺ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC16683.m39214(this.f74919, str);
                }
            });
            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        String string2 = str + 2;
        while (C16249.m38219(string2)) {
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(i2);
            string2 = sbM15339.toString();
            i2++;
        }
        C1867 c1867 = new C1867(activityC16683, activityC16683, str);
        c1867.m31258(R.string.MT_Protector);
        c1867.m31250((CharSequence) string2);
        c1867.m31244();
        c1867.m31279(6);
        c1867.m31281();
        c1867.m31266(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39214(ActivityC16683 activityC16683, String str) {
        C16249.m38215(str);
        activityC16683.f51210 = C16249.m38218();
        activityC16683.f51211.notifyDataSetChanged();
    }
}
