.class public final Ll/ۡۙۡ;
.super Ljava/lang/Object;
.source "71VH"

# interfaces
.implements Ll/ۖ۬ۡ;


# instance fields
.field public final ֫:Ll/᩻ۙۡ;


# direct methods
.method public constructor <init>(Ll/᩻ۙۡ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ۡۙۡ;->֫:Ll/᩻ۙۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;Ll/ۤۗۡ;)V
    .locals 1

    .line 65
    invoke-static {p2}, Ll/ۢۙۡ;->ۧ(Ll/۫ۗۡ;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p1}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result p1

    const/16 v0, 0x5f

    if-ne p1, v0, :cond_0

    .line 38
    iget-object p1, p0, Ll/ۡۙۡ;->֫:Ll/᩻ۙۡ;

    .line 33
    invoke-virtual {p1, p2}, Ll/᩻ۙۡ;->֫(Ll/۫ۗۡ;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗۗۡ;Ll/۬ۗۡ;)V
    .locals 1

    .line 65
    invoke-static {p2}, Ll/ۢۙۡ;->ۧ(Ll/۫ۗۡ;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, p1}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result p1

    const/16 v0, 0x5f

    if-ne p1, v0, :cond_0

    .line 31
    iget-object p1, p0, Ll/ۡۙۡ;->֫:Ll/᩻ۙۡ;

    .line 33
    invoke-virtual {p1, p2}, Ll/᩻ۙۡ;->֫(Ll/۫ۗۡ;)V

    :cond_0
    return-void
.end method
