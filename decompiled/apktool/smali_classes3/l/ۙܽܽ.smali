.class public final synthetic Ll/ۙܽܽ;
.super Ljava/lang/Object;
.source "45G7"

# interfaces
.implements Ll/ܶ᩻ܽ;
.implements Ll/ۚ۟;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۙܽܽ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public perform(Landroid/view/View;Ll/ۢ۟;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۙܽܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;

    invoke-static {v0, p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;->$r8$lambda$kcYefU7mDsxaDDUrYFwGm-Fzkow(Lcom/google/android/material/bottomsheet/BottomSheetDragHandleView;Landroid/view/View;Ll/ۢ۟;)Z

    move-result p1

    return p1
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۙܽܽ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 168
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
