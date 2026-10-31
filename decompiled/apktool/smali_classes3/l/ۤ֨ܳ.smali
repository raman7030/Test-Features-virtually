.class public final synthetic Ll/ۤ֨ܳ;
.super Ljava/lang/Object;
.source "98EM"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܺۘܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܺۘܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ֨ܳ;->᩸:Ll/ܺۘܳ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 2
    iget-object p1, p0, Ll/ۤ֨ܳ;->᩸:Ll/ܺۘܳ;

    .line 471
    invoke-virtual {p1}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f120411

    invoke-static {v0, p1}, Ll/ۙ᩸᩷;->֫(ILjava/lang/CharSequence;)V

    const/4 p1, 0x1

    return p1
.end method
