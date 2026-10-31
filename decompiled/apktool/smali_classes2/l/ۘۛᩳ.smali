.class public final synthetic Ll/ۘۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/۫ۨᩳ;

.field public final synthetic ۧ:Ll/᩶۟ᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۨᩳ;Ll/᩶۟ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۛᩳ;->֫:Ll/۫ۨᩳ;

    iput-object p2, p0, Ll/ۘۛᩳ;->ۧ:Ll/᩶۟ᩳ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 2
    sget-object v0, Ll/۫ۨᩳ;->᩻ܿ:Landroid/text/method/TextKeyListener;

    .line 4
    iget-object v0, p0, Ll/ۘۛᩳ;->֫:Ll/۫ۨᩳ;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3210
    iget-object v1, p0, Ll/ۘۛᩳ;->ۧ:Ll/᩶۟ᩳ;

    iget v1, v1, Ll/᩶۟ᩳ;->ܿ:F

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->֫(F)V

    const/4 v0, 0x0

    return-object v0
.end method
