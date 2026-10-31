.class public final Ll/᩶ۢ֨;
.super Ll/ۙۢ֨;
.source "I51P"


# instance fields
.field public final ֫:I

.field public final ۧ:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 220
    iput-object p1, p0, Ll/᩶ۢ֨;->ۧ:Landroid/content/res/Resources;

    .line 221
    iput p2, p0, Ll/᩶ۢ֨;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()Lpl/droidsonroids/gif/GifInfoHandle;
    .locals 3

    .line 226
    new-instance v0, Lpl/droidsonroids/gif/GifInfoHandle;

    iget-object v1, p0, Ll/᩶ۢ֨;->ۧ:Landroid/content/res/Resources;

    iget v2, p0, Ll/᩶ۢ֨;->֫:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Lpl/droidsonroids/gif/GifInfoHandle;-><init>(Landroid/content/res/AssetFileDescriptor;)V

    return-object v0
.end method
