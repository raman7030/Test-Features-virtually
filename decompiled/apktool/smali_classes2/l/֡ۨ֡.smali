.class public final Ll/֡ۨ֡;
.super Ll/֡᩵ۚ;
.source "T65P"


# instance fields
.field public final synthetic ᩸:Ll/ܰۨ֡;


# direct methods
.method public constructor <init>(Ll/ܰۨ֡;)V
    .locals 0

    .line 205
    iput-object p1, p0, Ll/֡ۨ֡;->᩸:Ll/ܰۨ֡;

    .line 42
    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 214
    new-instance v0, Ll/֨ۨ֡;

    iget-object v1, p0, Ll/֡ۨ֡;->᩸:Ll/ܰۨ֡;

    invoke-direct {v0, v1}, Ll/֨ۨ֡;-><init>(Ll/ܰۨ֡;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 208
    iget-object v0, p0, Ll/֡ۨ֡;->᩸:Ll/ܰۨ֡;

    invoke-static {v0}, Ll/ܰۨ֡;->ۧ(Ll/ܰۨ֡;)Ll/᩹ۨ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ۨ֡;->֫()I

    move-result v0

    return v0
.end method
