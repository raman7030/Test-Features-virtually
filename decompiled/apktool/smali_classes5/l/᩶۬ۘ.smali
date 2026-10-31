.class public abstract Ll/᩶۬ۘ;
.super Ljava/lang/Object;
.source "A8XS"

# interfaces
.implements Ll/ܶ۬ۘ;


# instance fields
.field public final ֫:Ljava/util/Map;

.field public ۧ:I

.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ljava/util/Map;ILjava/lang/String;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 15
    iput v0, p0, Ll/᩶۬ۘ;->ۧ:I

    .line 18
    iput-object p3, p0, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    .line 19
    iput p2, p0, Ll/᩶۬ۘ;->ᩳ:I

    .line 20
    iput-object p1, p0, Ll/᩶۬ۘ;->֫:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public attributes()Ljava/util/Map;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩶۬ۘ;->֫:Ljava/util/Map;

    return-object v0
.end method

.method public final end()I
    .locals 1

    .line 36
    iget v0, p0, Ll/᩶۬ۘ;->ۧ:I

    return v0
.end method

.method public final isClosed()Z
    .locals 2

    .line 52
    iget v0, p0, Ll/᩶۬ۘ;->ۧ:I

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/᩶۬ۘ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final start()I
    .locals 1

    .line 31
    iget v0, p0, Ll/᩶۬ۘ;->ᩳ:I

    return v0
.end method
