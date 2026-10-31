.class public Ll/ܰۨᩳ;
.super Ljava/lang/Object;
.source "T7I6"


# static fields
.field public static final ֫:Ll/ܰۨᩳ;

.field public static ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Ll/ܰۨᩳ;

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    sput-object v0, Ll/ܰۨᩳ;->֫:Ll/ܰۨᩳ;

    return-void
.end method


# virtual methods
.method public ֫()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ֫(ILbin/mt/plugin/api/util/ResultCallback;)V
    .locals 0

    if-eqz p2, :cond_0

    const-string p1, "Unsupported operation"

    .line 52
    invoke-interface {p2, p1}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ֫(Lbin/mt/plugin/api/util/ResultCallback;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "Unsupported operation"

    .line 34
    invoke-interface {p1, v0}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ܽ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ܿ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ᩳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
