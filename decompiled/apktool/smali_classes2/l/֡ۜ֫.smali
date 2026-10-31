.class public final Ll/֡ۜ֫;
.super Ljava/lang/Object;
.source "O5NM"

# interfaces
.implements Ll/᩵ۜ֫;


# instance fields
.field public final ֫:I

.field public final synthetic ۧ:Ll/ۚۜ֫;


# direct methods
.method public constructor <init>(Ll/ۚۜ֫;I)V
    .locals 0

    .line 3445
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۜ֫;->ۧ:Ll/ۚۜ֫;

    .line 3447
    iput p2, p0, Ll/֡ۜ֫;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 3

    .line 3454
    iget-object v0, p0, Ll/֡ۜ֫;->ۧ:Ll/ۚۜ֫;

    iget-object v1, v0, Ll/ۚۜ֫;->ۨ:Ll/ۡ᩻֫;

    iget v2, p0, Ll/֡ۜ֫;->֫:I

    if-eqz v1, :cond_0

    if-gez v2, :cond_0

    .line 3457
    invoke-virtual {v1}, Ll/ۡ᩻֫;->getChildFragmentManager()Ll/ۚۜ֫;

    move-result-object v1

    .line 3458
    invoke-virtual {v1}, Ll/ۚۜ֫;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    .line 3464
    invoke-virtual {v0, p1, p2, v2, v1}, Ll/ۚۜ֫;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    return p1
.end method
