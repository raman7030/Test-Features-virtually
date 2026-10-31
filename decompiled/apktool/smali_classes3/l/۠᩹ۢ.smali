.class public final synthetic Ll/۠᩹ۢ;
.super Ljava/lang/Object;
.source "Q1R8"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۤ᩹ۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤ᩹ۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩹ۢ;->᩸:Ll/ۤ᩹ۢ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    sget v0, Ll/ۤ᩹ۢ;->ۢۧ:I

    .line 331
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    .line 332
    iget-object p1, p0, Ll/۠᩹ۢ;->᩸:Ll/ۤ᩹ۢ;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method
