.class public final synthetic Ll/ۨۖᩳ;
.super Ljava/lang/Object;
.source "J57L"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:[Ljava/lang/CharSequence;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩺ۖᩳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩺ۖᩳ;II[Ljava/lang/CharSequence;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۖᩳ;->᩸:Ll/᩺ۖᩳ;

    iput p2, p0, Ll/ۨۖᩳ;->᩹:I

    iput p3, p0, Ll/ۨۖᩳ;->᩶:I

    iput-object p4, p0, Ll/ۨۖᩳ;->ۙ:[Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 0
    iget p1, p0, Ll/ۨۖᩳ;->᩶:I

    iget-object p2, p0, Ll/ۨۖᩳ;->ۙ:[Ljava/lang/CharSequence;

    iget-object v0, p0, Ll/ۨۖᩳ;->᩸:Ll/᩺ۖᩳ;

    iget v1, p0, Ll/ۨۖᩳ;->᩹:I

    invoke-static {v0, v1, p1, p2}, Ll/᩺ۖᩳ;->֫(Ll/᩺ۖᩳ;II[Ljava/lang/CharSequence;)V

    return-void
.end method
