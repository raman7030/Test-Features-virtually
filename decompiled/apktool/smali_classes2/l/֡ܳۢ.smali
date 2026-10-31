.class public final synthetic Ll/֡ܳۢ;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Ll/᩺ܳۡ;


# instance fields
.field public final synthetic ᩸:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܳۢ;->᩸:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Z)I
    .locals 0

    .line 2
    iget-object p2, p0, Ll/֡ܳۢ;->᩸:Ljava/util/Set;

    .line 602
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
