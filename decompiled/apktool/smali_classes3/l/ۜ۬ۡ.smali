.class public final Ll/ۜ۬ۡ;
.super Ljava/lang/Object;
.source "M1UK"

# interfaces
.implements Ll/ۡ۬ۡ;


# instance fields
.field public final ֫:Ll/ܺۙۡ;


# direct methods
.method public constructor <init>(Ll/ܺۙۡ;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ll/ۜ۬ۡ;->֫:Ll/ܺۙۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 1

    .line 15
    invoke-virtual {p1}, Ll/᩶ۗۡ;->᩻()Ll/ܽ۬ۡ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    iget-object v0, p0, Ll/ۜ۬ۡ;->֫:Ll/ܺۙۡ;

    .line 21
    invoke-virtual {v0, p1}, Ll/ܺۙۡ;->ۧ(Ll/ۗۗۡ;)V

    :cond_0
    return-void
.end method
