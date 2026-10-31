.class public final synthetic Ll/᩷᩺ᩳ;
.super Ljava/lang/Object;
.source "G4ML"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:[Ljava/lang/String;

.field public final synthetic ᩸:Ll/ܶ᩺ᩳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩺ᩳ;I[Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷᩺ᩳ;->᩸:Ll/ܶ᩺ᩳ;

    iput p2, p0, Ll/᩷᩺ᩳ;->᩹:I

    iput-object p3, p0, Ll/᩷᩺ᩳ;->᩶:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 0
    iget v0, p0, Ll/᩷᩺ᩳ;->᩹:I

    iget-object v1, p0, Ll/᩷᩺ᩳ;->᩶:[Ljava/lang/String;

    iget-object v2, p0, Ll/᩷᩺ᩳ;->᩸:Ll/ܶ᩺ᩳ;

    invoke-static {v2, v0, v1, p1, p2}, Ll/ܶ᩺ᩳ;->֫(Ll/ܶ᩺ᩳ;I[Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method
