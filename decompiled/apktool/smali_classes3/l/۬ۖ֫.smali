.class public final Ll/۬ۖ֫;
.super Ljava/lang/Object;
.source "X6AW"


# instance fields
.field public final ֫:Landroid/os/Bundle;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 1988
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 1993
    iput-object p2, p0, Ll/۬ۖ֫;->ۧ:Ljava/lang/String;

    .line 1994
    iput-object p1, p0, Ll/۬ۖ֫;->֫:Landroid/os/Bundle;

    return-void

    .line 1990
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ֫(Ll/۬ۖ֫;)Ljava/lang/String;
    .locals 0

    .line 1903
    iget-object p0, p0, Ll/۬ۖ֫;->ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/۬ۖ֫;)Landroid/os/Bundle;
    .locals 0

    .line 1903
    iget-object p0, p0, Ll/۬ۖ֫;->֫:Landroid/os/Bundle;

    return-object p0
.end method


# virtual methods
.method public final ֫()Landroid/os/Bundle;
    .locals 1

    .line 2008
    iget-object v0, p0, Ll/۬ۖ֫;->֫:Landroid/os/Bundle;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 2001
    iget-object v0, p0, Ll/۬ۖ֫;->ۧ:Ljava/lang/String;

    return-object v0
.end method
