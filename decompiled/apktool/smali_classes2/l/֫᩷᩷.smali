.class public final Ll/֫᩷᩷;
.super Ljava/lang/Object;
.source "P7RC"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final ᩸:Ll/ۖ۫᩻;


# direct methods
.method public constructor <init>(Ll/ۖ۫᩻;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Ll/֫᩷᩷;->᩸:Ll/ۖ۫᩻;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 99
    iget-object p1, p0, Ll/֫᩷᩷;->᩸:Ll/ۖ۫᩻;

    invoke-virtual {p1}, Ll/ۖ۫᩻;->run()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
