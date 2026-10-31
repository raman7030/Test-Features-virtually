.class public final Ll/ᩳᩳ֫;
.super Ljava/lang/Object;
.source "DB30"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:Ljava/util/ArrayList;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    .line 1606
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p3, "initCallbacks cannot be null"

    .line 1607
    invoke-static {p1, p3}, Ll/ܰۤ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1608
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, Ll/ᩳᩳ֫;->᩸:Ljava/util/ArrayList;

    .line 1609
    iput p2, p0, Ll/ᩳᩳ֫;->᩹:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1615
    iget-object v0, p0, Ll/ᩳᩳ֫;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 1616
    iget v2, p0, Ll/ᩳᩳ֫;->᩹:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v2, v3, :cond_0

    :goto_0
    if-ge v4, v1, :cond_1

    .line 1625
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽᩳ֫;

    invoke-virtual {v2}, Ll/ܽᩳ֫;->֫()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v4, v1, :cond_1

    .line 1619
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽᩳ֫;

    invoke-virtual {v2}, Ll/ܽᩳ֫;->ۧ()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
