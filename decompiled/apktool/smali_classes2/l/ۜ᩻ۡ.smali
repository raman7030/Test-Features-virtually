.class public final Ll/ۜ᩻ۡ;
.super Ljava/lang/Object;
.source "08W8"


# static fields
.field public static final ֫:Ll/ۚۡ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Ll/ۚۡ֫;

    invoke-direct {v0}, Ll/ۚۡ֫;-><init>()V

    sput-object v0, Ll/ۜ᩻ۡ;->֫:Ll/ۚۡ֫;

    return-void
.end method

.method public static final ֫(II)[Ljava/lang/String;
    .locals 1

    const/16 v0, 0x1069

    .line 140
    invoke-static {v0}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v0

    .line 141
    invoke-virtual {v0, p0}, Ll/ᩳᩴۡ;->ۧ(I)V

    .line 142
    invoke-virtual {v0, p1}, Ll/ᩳᩴۡ;->֫(I)V

    .line 143
    invoke-virtual {v0}, Ll/ᩳᩴۡ;->ᩳ()Ll/᩻ᩴۡ;

    move-result-object p0

    .line 144
    invoke-virtual {p0}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 145
    invoke-virtual {p0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 147
    :cond_0
    new-instance p1, Ll/֫ۛۡ;

    const v0, 0x7f120520

    .line 232
    invoke-static {p0, v0}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object p0

    .line 16
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 147
    throw p1
.end method
