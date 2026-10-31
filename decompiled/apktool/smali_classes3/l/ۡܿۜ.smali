.class public final Ll/ۡܿۜ;
.super Ljava/lang/Object;
.source "L78E"


# instance fields
.field public ֫:Ll/֫ܿۜ;

.field public ۧ:I

.field public final ܽ:Ljava/util/ArrayList;

.field public ᩳ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1725
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1729
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۡܿۜ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۠ۜۜ;
    .locals 4

    .line 1776
    new-instance v0, Ll/۠ۜۜ;

    iget v1, p0, Ll/ۡܿۜ;->ۧ:I

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ۡܿۜ;->ܽ:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-boolean v3, p0, Ll/ۡܿۜ;->ᩳ:Z

    invoke-direct {v0, v2, v1, v3}, Ll/۠ۜۜ;-><init>(Ljava/util/ArrayList;IZ)V

    return-object v0
.end method
