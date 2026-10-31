.class public final Ll/᩷۬ۡ;
.super Ljava/lang/Object;
.source "L1U8"

# interfaces
.implements Ll/ۡ۬ۡ;


# instance fields
.field public final ֫:Ll/ۢ۬ۡ;


# direct methods
.method public constructor <init>(Ll/ۢ۬ۡ;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/᩷۬ۡ;->֫:Ll/ۢ۬ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 1

    .line 34
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ۧ()I

    move-result v0

    not-int v0, v0

    and-int/lit16 v0, v0, 0x400

    if-nez v0, :cond_0

    .line 35
    iget-object v0, p0, Ll/᩷۬ۡ;->֫:Ll/ۢ۬ۡ;

    invoke-virtual {v0, p1}, Ll/ۢ۬ۡ;->֫(Ll/ۗۗۡ;)V

    :cond_0
    return-void
.end method
