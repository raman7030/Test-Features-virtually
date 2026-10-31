.class public final synthetic Ll/ۛ۟ᩳ;
.super Ljava/lang/Object;
.source "S4H6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۫ۨᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۨᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ۟ᩳ;->᩸:Ll/۫ۨᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 568
    iget-object v0, p0, Ll/ۛ۟ᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧ()V

    .line 569
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method
