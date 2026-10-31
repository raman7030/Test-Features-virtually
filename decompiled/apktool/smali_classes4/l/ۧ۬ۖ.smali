.class public final Ll/ۧ۬ۖ;
.super Ljava/lang/Object;
.source "24P9"

# interfaces
.implements Ll/ܰۗۖ;


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ll/ۧ۬ۖ;

.field public ܽ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Ll/ۧ۬ۖ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫()C
    .locals 1

    .line 29
    iget-boolean v0, p0, Ll/ۧ۬ۖ;->ܽ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x78

    return v0

    :cond_0
    const/16 v0, 0x2e

    return v0
.end method
