.class public final Ll/ܺܳ֫;
.super Ljava/lang/Object;
.source "RB93"

# interfaces
.implements Ll/ܳ۫;


# instance fields
.field public final synthetic ֫:Landroid/animation/Animator;

.field public final synthetic ۧ:Ll/ۙ᩷֫;


# direct methods
.method public constructor <init>(Landroid/animation/Animator;Ll/ۙ᩷֫;)V
    .locals 0

    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺܳ֫;->֫:Landroid/animation/Animator;

    iput-object p2, p0, Ll/ܺܳ֫;->ۧ:Ll/ۙ᩷֫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 237
    iget-object v0, p0, Ll/ܺܳ֫;->֫:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    const/4 v0, 0x2

    .line 238
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    iget-object v0, p0, Ll/ܺܳ֫;->ۧ:Ll/ۙ᩷֫;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method
