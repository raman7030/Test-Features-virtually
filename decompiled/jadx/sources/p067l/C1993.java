package p067l;

import android.app.Person;
import android.content.Context;

/* JADX INFO: renamed from: l.᩺᩶ */
/* JADX INFO: compiled from: 374 */
/* JADX INFO: loaded from: classes.dex */
public final class C1993 {
    /* JADX INFO: renamed from: ֫ */
    public static C1538 m53899(Person person) {
        CharSequence name = person.getName();
        C1073 c1073M15502 = person.getIcon() != null ? C1073.m15502(person.getIcon()) : null;
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        C1538 c1538 = new C1538();
        c1538.f45517 = name;
        c1538.f45513 = c1073M15502;
        c1538.f45515 = uri;
        c1538.f45518 = key;
        c1538.f45514 = zIsBot;
        c1538.f45516 = zIsImportant;
        return c1538;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Person m53898(C1538 c1538) {
        Person.Builder name = new Person.Builder().setName(c1538.f45517);
        C1073 c1073 = c1538.f45513;
        return name.setIcon(c1073 != null ? c1073.m15508((Context) null) : null).setUri(c1538.f45515).setKey(c1538.f45518).setBot(c1538.f45514).setImportant(c1538.f45516).build();
    }
}
