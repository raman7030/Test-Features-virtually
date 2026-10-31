.class public final Ll/ܺ᩺;
.super Ljava/lang/Object;
.source "E9O4"

# interfaces
.implements Ll/ܳۙ᩵;


# instance fields
.field public final synthetic ֫:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Ll/۬۬ۧ;)V
    .locals 0

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ܺ᩺;->֫:Ll/۬۬ۧ;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 87
    new-instance v0, Ll/ۘ᩺;

    iget-object v1, p0, Ll/ܺ᩺;->֫:Ll/۬۬ۧ;

    invoke-direct {v0, v1}, Ll/ۘ᩺;-><init>(Landroid/view/ViewGroup;)V

    return-object v0
.end method
