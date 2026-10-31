.class public abstract Ll/ۛ۫ۖ;
.super Ll/ۚ۬ۖ;
.source "89IN"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public ᩹:[B


# direct methods
.method public constructor <init>(Ll/ۨ۬ۖ;[B)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Ll/ۚ۬ۖ;-><init>(Ll/ۨ۬ۖ;)V

    .line 32
    iput-object p2, p0, Ll/ۛ۫ۖ;->᩹:[B

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 37
    iget-object v0, p0, Ll/ۚ۬ۖ;->᩸:Ll/ۨ۬ۖ;

    invoke-virtual {v0}, Ll/ۨ۬ۖ;->֫()Ll/֡۬ۖ;

    move-result-object v0

    sget-object v1, Ll/֡۬ۖ;->᩶:Ll/֡۬ۖ;

    if-ne v0, v1, :cond_0

    .line 38
    sget-object v0, Ll/ۨ۬ۖ;->ۡ:Ll/ۨ۬ۖ;

    new-instance v1, Ll/ܰۛۡ;

    .line 28
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {v0, v1}, Ll/ۨ۬ۖ;->֫(Ll/ܰۛۡ;)Ll/ۘ۬ۖ;

    move-result-object v1

    iget-object v2, p0, Ll/ۛ۫ۖ;->᩹:[B

    invoke-virtual {v1, v0, v2}, Ll/ۘ۬ۖ;->֫(Ll/ۨ۬ۖ;[B)Ll/ۚ۬ۖ;

    move-result-object v0

    check-cast v0, Ll/֫۫ۖ;

    invoke-virtual {v0}, Ll/֫۫ۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    .line 40
    :cond_0
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
