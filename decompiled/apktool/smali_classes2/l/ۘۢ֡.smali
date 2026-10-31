.class public final Ll/ۘۢ֡;
.super Ljava/io/IOException;
.source "87IM"

# interfaces
.implements Ljava/lang/Iterable;


# static fields
.field public static final serialVersionUID:J = 0x1L

.field public static final synthetic ᩹:I


# instance fields
.field public final ᩸:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    .line 59
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 63
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    aput-object p2, v2, v0

    const-string p1, "%,d exception(s): %s"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    if-eqz p2, :cond_2

    .line 59
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_4

    const/4 v0, 0x0

    goto :goto_4

    .line 88
    :cond_4
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_4
    invoke-direct {p0, p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez p2, :cond_5

    .line 89
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_5
    iput-object p2, p0, Ll/ۘۢ֡;->᩸:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۘۢ֡;->᩸:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 138
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
