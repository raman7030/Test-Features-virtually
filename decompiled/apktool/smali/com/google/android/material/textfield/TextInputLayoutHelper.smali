.class public Lcom/google/android/material/textfield/TextInputLayoutHelper;
.super Ljava/lang/Object;
.source "TextInputLayoutHelper.java"


# static fields
.field public static final endCompoundLayoutField:Ljava/lang/reflect/Field;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 14
    :try_start_0
    const-class v0, Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "endLayout"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lcom/google/android/material/textfield/TextInputLayoutHelper;->endCompoundLayoutField:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 17
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getEndCompoundLayout(Lcom/google/android/material/textfield/TextInputLayout;)Lcom/google/android/material/textfield/EndCompoundLayout;
    .locals 1

    .line 23
    :try_start_0
    sget-object v0, Lcom/google/android/material/textfield/TextInputLayoutHelper;->endCompoundLayoutField:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/EndCompoundLayout;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 25
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static getEndIconDelegateOnClickListener(Lcom/google/android/material/textfield/TextInputLayout;)Landroid/view/View$OnClickListener;
    .locals 0

    .line 30
    invoke-static {p0}, Lcom/google/android/material/textfield/TextInputLayoutHelper;->getEndCompoundLayout(Lcom/google/android/material/textfield/TextInputLayout;)Lcom/google/android/material/textfield/EndCompoundLayout;

    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconDelegate()Lcom/google/android/material/textfield/EndIconDelegate;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndIconDelegate;->getOnIconClickListener()Landroid/view/View$OnClickListener;

    move-result-object p0

    return-object p0
.end method

.method public static hasPasswordTransformation(Lcom/google/android/material/textfield/TextInputLayout;)Z
    .locals 0

    .line 35
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 37
    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object p0

    instance-of p0, p0, Landroid/text/method/PasswordTransformationMethod;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static setPasswordTransformation(Lcom/google/android/material/textfield/TextInputLayout;Z)V
    .locals 1

    .line 41
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 43
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 44
    invoke-static {p0}, Lcom/google/android/material/textfield/TextInputLayoutHelper;->getEndCompoundLayout(Lcom/google/android/material/textfield/TextInputLayout;)Lcom/google/android/material/textfield/EndCompoundLayout;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndCompoundLayout;->getEndIconDelegate()Lcom/google/android/material/textfield/EndIconDelegate;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/EndIconDelegate;->refreshIconState()V

    :cond_1
    return-void
.end method
