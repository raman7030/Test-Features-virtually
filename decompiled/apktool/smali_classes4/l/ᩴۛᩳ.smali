.class public final synthetic Ll/ᩴۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۫ۨᩳ;

.field public final synthetic ᩹:Ll/ܿܽܿ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۨᩳ;Ll/ܿܽܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۛᩳ;->᩸:Ll/۫ۨᩳ;

    iput-object p2, p0, Ll/ᩴۛᩳ;->᩹:Ll/ܿܽܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    sget-object v0, Ll/۫ۨᩳ;->᩻ܿ:Landroid/text/method/TextKeyListener;

    .line 3278
    iget-object v0, p0, Ll/ᩴۛᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v1

    .line 3279
    iget-object v0, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget-object v2, p0, Ll/ᩴۛᩳ;->᩹:Ll/ܿܽܿ;

    if-ne v0, v2, :cond_0

    if-lez v1, :cond_0

    invoke-virtual {v2}, Ll/ܿܽܿ;->ۢ()F

    move-result v0

    int-to-float v3, v1

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_0

    .line 3280
    invoke-virtual {v2, v1}, Ll/ܿܽܿ;->ܳ(I)V

    :cond_0
    return-void
.end method
