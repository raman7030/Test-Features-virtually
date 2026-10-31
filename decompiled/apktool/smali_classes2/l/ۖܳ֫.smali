.class public final Ll/ۖܳ֫;
.super Ljava/lang/Object;
.source "RB93"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۘܳ֫;


# direct methods
.method public constructor <init>(Ll/ۘܳ֫;)V
    .locals 0

    .line 300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܳ֫;->᩸:Ll/ۘܳ֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 303
    iget-object v0, p0, Ll/ۖܳ֫;->᩸:Ll/ۘܳ֫;

    iget-object v1, v0, Ll/ۘܳ֫;->ۧ:Landroid/view/ViewGroup;

    iget-object v2, v0, Ll/ۘܳ֫;->ᩳ:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 304
    iget-object v0, v0, Ll/ۘܳ֫;->֫:Ll/۠ܳ֫;

    invoke-virtual {v0}, Ll/ܶܳ֫;->֫()V

    return-void
.end method
