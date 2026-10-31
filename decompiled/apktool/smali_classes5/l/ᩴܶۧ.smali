.class public final Ll/ᩴܶۧ;
.super Ljava/lang/Object;
.source "V685"

# interfaces
.implements Ll/۟ܶۧ;


# static fields
.field public static ᩸:Ll/ᩴܶۧ;


# direct methods
.method public static ֫()Ll/ᩴܶۧ;
    .locals 1

    .line 342
    sget-object v0, Ll/ᩴܶۧ;->᩸:Ll/ᩴܶۧ;

    if-nez v0, :cond_0

    .line 343
    new-instance v0, Ll/ᩴܶۧ;

    .line 331
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 343
    sput-object v0, Ll/ᩴܶۧ;->᩸:Ll/ᩴܶۧ;

    .line 345
    :cond_0
    sget-object v0, Ll/ᩴܶۧ;->᩸:Ll/ᩴܶۧ;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/֫᩸ۧ;)Ljava/lang/CharSequence;
    .locals 1

    .line 327
    check-cast p1, Ll/᩵ܶۧ;

    .line 351
    invoke-virtual {p1}, Ll/᩵ܶۧ;->᩵֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    invoke-virtual {p1}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f120700

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 354
    :cond_0
    invoke-virtual {p1}, Ll/᩵ܶۧ;->᩵֫()Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
