.class public final Ll/ᩴܶ᩵;
.super Ljava/lang/Object;
.source "F5KS"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:Ll/ۜܶ᩵;


# direct methods
.method public constructor <init>(Ll/ۜܶ᩵;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴܶ᩵;->᩸:Ll/ۜܶ᩵;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 25
    new-instance v0, Ll/᩵ܶ᩵;

    iget-object v1, p0, Ll/ᩴܶ᩵;->᩸:Ll/ۜܶ᩵;

    iget-object v1, v1, Ll/ۜܶ᩵;->᩸:Ljava/util/List;

    .line 1671
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Ll/᩵ܶ᩵;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method
