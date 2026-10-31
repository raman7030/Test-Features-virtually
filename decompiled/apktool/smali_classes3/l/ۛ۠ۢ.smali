.class public final synthetic Ll/ۛ۠ۢ;
.super Ljava/lang/Object;
.source "998H"

# interfaces
.implements Ll/֫ۛ;


# instance fields
.field public final synthetic ֫:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ۠ۢ;->֫:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 2
    iget v0, p0, Ll/ۛ۠ۢ;->֫:I

    packed-switch v0, :pswitch_data_0

    const-string v0, ".ts-movie"

    const/4 v1, 0x1

    .line 58
    invoke-static {v0, v1}, Ll/ۖ֨ܿ;->֫(Ljava/lang/String;Z)Ll/ۖ֨ܿ;

    move-result-object v0

    return-object v0

    :pswitch_0
    const v0, 0x7f080254

    .line 297
    invoke-static {v0}, Ll/ۛۢۡ;->֫(I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
