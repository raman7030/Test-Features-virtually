.class public final synthetic Ll/֫֨۠;
.super Ljava/lang/Object;
.source "J416"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/ۚۚ۠;


# direct methods
.method public synthetic constructor <init>(Ll/ۚۚ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫֨۠;->᩸:Ll/ۚۚ۠;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/֫֨۠;->᩸:Ll/ۚۚ۠;

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
