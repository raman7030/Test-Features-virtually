.class public Lorg/simpleframework/xml/util/Resolver$Cache;
.super Lorg/simpleframework/xml/util/LimitedCache;
.source "Resolver.java"


# instance fields
.field public final synthetic this$0:Lorg/simpleframework/xml/util/Resolver;


# direct methods
.method public constructor <init>(Lorg/simpleframework/xml/util/Resolver;)V
    .locals 0

    .line 305
    iput-object p1, p0, Lorg/simpleframework/xml/util/Resolver$Cache;->this$0:Lorg/simpleframework/xml/util/Resolver;

    const/16 p1, 0x400

    .line 306
    invoke-direct {p0, p1}, Lorg/simpleframework/xml/util/LimitedCache;-><init>(I)V

    return-void
.end method
