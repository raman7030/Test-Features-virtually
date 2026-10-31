.class public final Ll/ۛ᩵ᩴ;
.super Ljava/lang/Object;
.source "QIY"


# static fields
.field public static final ֫:Ll/ۤ᩵ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 170
    new-instance v0, Ll/ۤ᩵ᩴ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 170
    sput-object v0, Ll/ۛ᩵ᩴ;->֫:Ll/ۤ᩵ᩴ;

    return-void
.end method

.method public static ֫(Ll/۫᩵ᩴ;)Ll/۫֡ᩴ;
    .locals 1

    .line 41
    invoke-interface {p0}, Ll/۫᩵ᩴ;->ۢۧ()Ll/ᩴۚᩴ;

    move-result-object p0

    .line 42
    instance-of v0, p0, Ll/۬᩵ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/۬᩵ᩴ;

    invoke-interface {p0}, Ll/۬᩵ᩴ;->֫()Ll/۫֡ᩴ;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ll/ᩴۚᩴ;->iterator()Ll/۫֡ᩴ;

    move-result-object p0

    return-object p0
.end method
