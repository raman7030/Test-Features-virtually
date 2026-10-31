.class public final synthetic Ll/ۤۨᩳ;
.super Ljava/lang/Object;
.source "YAH9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:Ll/۬᩹ᩳ;

.field public final synthetic ᩸:Ll/۫ۨᩳ;

.field public final synthetic ᩹:Ll/۟᩺ᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/۬᩹ᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۨᩳ;->᩸:Ll/۫ۨᩳ;

    iput-object p2, p0, Ll/ۤۨᩳ;->᩹:Ll/۟᩺ᩳ;

    iput-object p3, p0, Ll/ۤۨᩳ;->᩶:Ll/۬᩹ᩳ;

    iput p4, p0, Ll/ۤۨᩳ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/4 v0, 0x1

    .line 472
    iget-object v1, p0, Ll/ۤۨᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-virtual {v1, v0}, Ll/۫ۨᩳ;->ᩳ(Z)V

    .line 473
    iget-object v0, p0, Ll/ۤۨᩳ;->᩹:Ll/۟᩺ᩳ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    iget-object v4, p0, Ll/ۤۨᩳ;->᩶:Ll/۬᩹ᩳ;

    invoke-interface {v0, v3, v2, v4}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 474
    invoke-virtual {v4}, Ll/۬᩹ᩳ;->length()I

    move-result v0

    iget v2, p0, Ll/ۤۨᩳ;->ۙ:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1, v0}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 1040
    invoke-virtual {v1, v3}, Ll/۫ۨᩳ;->ᩳ(Z)V

    return-void
.end method
