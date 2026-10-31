.class public final synthetic Ll/ۚܽܽ;
.super Ljava/lang/Object;
.source "HAQ9"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Thread;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚܽܽ;->᩸:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/Thread;

    .line 4
    check-cast p2, Ljava/lang/Thread;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 75
    :cond_0
    iget-object v0, p0, Ll/ۚܽܽ;->᩸:Ljava/lang/Thread;

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    if-ne p2, v0, :cond_2

    const/4 p1, 0x1

    return p1

    .line 79
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
