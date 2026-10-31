.class public final synthetic Ll/۫۬᩷;
.super Ljava/lang/Object;
.source "81ID"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/֫۫᩷;

.field public final synthetic ᩹:Ll/ܿۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/֫۫᩷;Ll/ܿۛ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫۬᩷;->᩸:Ll/֫۫᩷;

    iput-object p2, p0, Ll/۫۬᩷;->᩹:Ll/ܿۛ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 82
    new-instance p1, Ll/ۛ۬᩷;

    iget-object p2, p0, Ll/۫۬᩷;->᩸:Ll/֫۫᩷;

    invoke-direct {p1, p2}, Ll/ۛ۬᩷;-><init>(Ll/֫۫᩷;)V

    iget-object p2, p0, Ll/۫۬᩷;->᩹:Ll/ܿۛ᩷;

    invoke-virtual {p2, p1}, Ll/ܿۛ᩷;->ܽ(Ljava/lang/Runnable;)V

    return-void
.end method
