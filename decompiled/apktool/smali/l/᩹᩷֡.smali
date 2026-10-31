.class public final Ll/᩹᩷֡;
.super Ljava/lang/Object;
.source "F8FV"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>([B)V
    .locals 3

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x15

    const/4 v2, 0x0

    invoke-static {v2, v1, p1}, Ll/ۛ᩷֡;->ܽ(II[B)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩹᩷֡;->ۧ:Ljava/util/ArrayList;

    const/16 v0, 0x1f8

    .line 319
    aget-byte p1, p1, v0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 v2, 0x1

    .line 72
    :cond_0
    iput-boolean v2, p0, Ll/᩹᩷֡;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/᩹᩷֡;->ۧ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Ll/᩹᩷֡;->֫:Z

    return v0
.end method
