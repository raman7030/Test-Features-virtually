.class public final synthetic Ll/ᩳ᩹ܽ;
.super Ljava/lang/Object;
.source "P676"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩷᩶ܽ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/᩷᩶ܽ;ZI)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ᩹ܽ;->᩸:Ll/᩷᩶ܽ;

    iput-boolean p2, p0, Ll/ᩳ᩹ܽ;->᩹:Z

    iput p3, p0, Ll/ᩳ᩹ܽ;->᩶:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 0
    iget-boolean p1, p0, Ll/ᩳ᩹ܽ;->᩹:Z

    iget p2, p0, Ll/ᩳ᩹ܽ;->᩶:I

    iget-object v0, p0, Ll/ᩳ᩹ܽ;->᩸:Ll/᩷᩶ܽ;

    invoke-static {v0, p1, p2}, Ll/᩷᩶ܽ;->֫(Ll/᩷᩶ܽ;ZI)V

    return-void
.end method
