.class public final synthetic Ll/ۖܿܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ljava/lang/Runnable;

.field public final synthetic ۙ:Ll/֫ۛ;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/֡ܳܿ;

.field public final synthetic ᩹:[I


# direct methods
.method public synthetic constructor <init>(Ll/֡ܳܿ;[IILl/֫ۛ;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܿܿ;->᩸:Ll/֡ܳܿ;

    iput-object p2, p0, Ll/ۖܿܿ;->᩹:[I

    iput p3, p0, Ll/ۖܿܿ;->᩶:I

    iput-object p4, p0, Ll/ۖܿܿ;->ۙ:Ll/֫ۛ;

    iput-object p5, p0, Ll/ۖܿܿ;->ۗ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 0
    iget-object p1, p0, Ll/ۖܿܿ;->ۙ:Ll/֫ۛ;

    iget-object p2, p0, Ll/ۖܿܿ;->ۗ:Ljava/lang/Runnable;

    iget-object v0, p0, Ll/ۖܿܿ;->᩸:Ll/֡ܳܿ;

    iget-object v1, p0, Ll/ۖܿܿ;->᩹:[I

    iget v2, p0, Ll/ۖܿܿ;->᩶:I

    invoke-static {v0, v1, v2, p1, p2}, Ll/֡ܳܿ;->֫(Ll/֡ܳܿ;[IILl/֫ۛ;Ljava/lang/Runnable;)V

    return-void
.end method
