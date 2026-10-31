.class public final Ll/ۛܿܽ;
.super Ljava/lang/Object;
.source "Y6J0"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛܿܽ;->ܽ:Ljava/util/ArrayList;

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛܿܽ;->ۧ:Ljava/util/ArrayList;

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛܿܽ;->֫:Ljava/util/ArrayList;

    return-void
.end method
