.class public final synthetic Ll/ܽ᩹ܽ;
.super Ljava/lang/Object;
.source "P676"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/᩷᩶ܽ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/᩷᩶ܽ;ZLjava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩹ܽ;->᩸:Ll/᩷᩶ܽ;

    iput-boolean p2, p0, Ll/ܽ᩹ܽ;->᩹:Z

    iput-object p3, p0, Ll/ܽ᩹ܽ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 0
    iget-boolean p1, p0, Ll/ܽ᩹ܽ;->᩹:Z

    iget-object p2, p0, Ll/ܽ᩹ܽ;->᩶:Ljava/lang/String;

    iget-object v0, p0, Ll/ܽ᩹ܽ;->᩸:Ll/᩷᩶ܽ;

    invoke-static {v0, p1, p2}, Ll/᩷᩶ܽ;->֫(Ll/᩷᩶ܽ;ZLjava/lang/String;)V

    return-void
.end method
