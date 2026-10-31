.class public final Ll/ᩴۨ֫;
.super Ljava/lang/Object;
.source "M7MY"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ll/ۘۨ֫;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v3, 0x5

    .line 36
    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 34
    iput-object v0, p0, Ll/ᩴۨ֫;->֫:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/net/Uri;[B)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    iget-object v0, p0, Ll/ᩴۨ֫;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-void
.end method

.method public final ֫(Landroid/net/Uri;)[B
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 53
    :cond_0
    iget-object v0, p0, Ll/ᩴۨ֫;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method public final ۧ(Landroid/net/Uri;)[B
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    iget-object v0, p0, Ll/ᩴۨ֫;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method
